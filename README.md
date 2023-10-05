# AnimatedBottomBarCompose

**AnimatedBottomBarCompose** is a Jetpack Compose library that simplifies the creation of stylish
Bottom Navigation Bars with
customizable animations. It allows you to easily integrate attractive navigation bars into your
Android app, enhancing the user experience.


<p align="center">
  <img src="https://github.com/canopas/AnimatedBottomBarCompose/assets/98312779/051e298d-59bb-4082-848a-ce4762b3a486" alt="Sample gif">
    <img src="https://github.com/canopas/AnimatedBottomBarCompose/assets/98312779/541694b3-acb1-4adb-b599-28da3e9d6805" alt="Sample gif">
    <img src="https://github.com/canopas/AnimatedBottomBarCompose/assets/98312779/d6c5f046-4f06-41fc-a192-96cd189d9f01" alt="Sample gif">
    <img src="https://github.com/canopas/AnimatedBottomBarCompose/assets/98312779/60c09fc8-61df-4047-8a8e-ac159436278f" alt="Sample gif">
    <img src="https://github.com/canopas/AnimatedBottomBarCompose/assets/98312779/0b9a21c7-39a7-4eee-a483-d13c4f2cb270" alt="Sample gif">
    <img src="https://github.com/canopas/AnimatedBottomBarCompose/assets/98312779/e4597c2a-9e5c-42a2-9e7b-86c327a0b57f" alt="Sample gif">
    <img src="https://github.com/canopas/AnimatedBottomBarCompose/assets/98312779/bd72551c-bda5-4cda-b03c-2b96b74effe1" alt="Sample gif">
    <img src="https://github.com/canopas/AnimatedBottomBarCompose/assets/98312779/c136437e-70d2-4a8e-bfbc-7881cb844d0d" alt="Sample gif">
</p>

## Features

- **Multiple Styles:** Choose from a variety of pre-defined styles for your Bottom Navigation Bar or
  create your custom style.
- **Animation Options:** Choose from variety of eye-catching animations for your navigation bar
  elements, making your app more engaging.
- **Customization:** Customize colors, icons, and animations to match your app's branding and
  design.

## Sample Usage

Integrating **AnimatedBottomBarCompose** into your Android app is a breeze! Follow these simple
steps to get started:

1. First, set up your navigation controller:

```
val navController = rememberNavController()
val navBackStackEntry by navController.currentBackStackEntryAsState()
val currentRoute = navBackStackEntry?.destination?.route
val navigationItems = MainNavigation::class.nestedClasses.map {
    it.objectInstance as MainNavigation
}
var selectedItem by remember { mutableIntStateOf(0) }
```

2. Next, add **AnimatedBottomBarCompose** to your app's Scaffold as the bottom bar:

```
Scaffold(
    bottomBar = {
        AnimatedBottomBar(
            selectedItem = selectedItem,
            itemSize = navigationItems.take(3).size,
            containerColor = Color.LightGray,
            indicatorStyle = IndicatorStyle.LINE
        ) {
            navigationItems.forEachIndexed { index, navigationItem ->
                BottomBarItem(
                    selected = currentRoute == navigationItem.route,
                    onClick = {
                        if (currentRoute != navigationItem.route) {
                            selectedItem = index
                            // ... Navigation Stuff
                    },
                    imageVector = navigationItem.icon,
                    label = navigationItem.title,
                    containerColor = Color.Transparent
                )
            }
        }
    }
) {
// ... (rest of your app content)
}
```

## Demo

To see **AnimatedBottomBarCompose** in action, check out
our [Sample](https://github.com/canopas/AnimatedBottomBarCompose/tree/master/app) app where you can
explore various styles and animation options.

## Bugs and Feedback

For bugs, questions and discussions please use
the [Github Issues](https://github.com/canopas/AnimatedBottomBarCompose/issues)

## Credits

**AnimatedBottomBarCompose** is owned and maintained by the [Canopas team](https://canopas.com/).
For project updates and releases, you can follow them on Twitter
at [@canopassoftware](https://twitter.com/canopassoftware).

# Licence

```
Copyright 2023 Canopas Software LLP

Licensed under the Apache License, Version 2.0 (the "License");
You won't be using this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

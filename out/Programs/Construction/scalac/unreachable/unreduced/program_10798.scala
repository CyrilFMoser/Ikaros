package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[Int]
case class CC_D(a: (T_B[Char],T_B[Int]), b: T_B[Int]) extends T_B[Int]
case class CC_E() extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D((_,CC_C()), CC_D(_, _)) => 1 
  case CC_D((_,CC_C()), CC_E()) => 2 
  case CC_D((_,CC_D(_, _)), CC_C()) => 3 
  case CC_D((_,CC_D(_, _)), CC_D(_, _)) => 4 
  case CC_D((_,CC_D(_, _)), CC_E()) => 5 
  case CC_D((_,CC_E()), CC_C()) => 6 
  case CC_D((_,CC_E()), CC_D(_, _)) => 7 
  case CC_D((_,CC_E()), CC_E()) => 8 
  case CC_E() => 9 
}
}
// This is not matched: CC_D((_,CC_C()), CC_C())
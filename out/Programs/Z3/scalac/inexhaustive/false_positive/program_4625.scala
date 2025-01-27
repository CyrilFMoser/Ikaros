package Program_15 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: Boolean, c: T_A) extends T_A
case class CC_D[D, C]() extends T_B[C, D]
case class CC_E[E, F, G](a: Int, b: CC_A, c: CC_C) extends T_B[E, F]

val v_a: T_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_A(), CC_C(_, _, _)) => 1 
}
}
// This is not matched: (CC_E Char
//      Char
//      T_A
//      Int
//      Wildcard
//      (CC_C Wildcard Wildcard (CC_B T_A) T_A)
//      (T_B Char Char))
// This is not matched: (CC_D Char Char (T_B Char Char))
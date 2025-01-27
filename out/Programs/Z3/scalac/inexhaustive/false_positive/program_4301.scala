package Program_14 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: (Char,T_A), b: C) extends T_A
case class CC_C(a: CC_A, b: T_A, c: Int) extends T_A
case class CC_D[E, D](a: T_A, b: T_A, c: T_B[D, E]) extends T_B[E, D]

val v_a: CC_D[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _, _), CC_C(_, _, _), _) => 0 
  case CC_D(_, CC_B(_, _), _) => 1 
  case CC_D(CC_A(), CC_C(_, _, _), _) => 2 
  case CC_D(CC_A(), _, CC_D(_, _, _)) => 3 
  case CC_D(CC_B(_, _), CC_B(_, _), CC_D(_, _, _)) => 4 
}
}
// This is not matched: (CC_D Char
//      (CC_C T_A T_A T_A T_A)
//      (CC_C Wildcard (CC_A T_A) Int T_A)
//      (CC_A T_A)
//      Wildcard
//      (T_B Char (CC_C T_A T_A T_A T_A)))
// This is not matched: (CC_D Char
//      (CC_C T_A T_A T_A T_A)
//      (CC_A T_A)
//      Wildcard
//      Wildcard
//      (T_B Char (CC_C T_A T_A T_A T_A)))
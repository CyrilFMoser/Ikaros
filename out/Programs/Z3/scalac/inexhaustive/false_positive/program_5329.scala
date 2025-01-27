package Program_14 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: T_A[Char], b: CC_A[D]) extends T_A[C]
case class CC_C[E](a: ((Byte,Int),Byte), b: Char) extends T_A[E]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), CC_A()) => 0 
  case CC_B(CC_A(), CC_A()) => 1 
}
}
// This is not matched: (CC_B Char
//      Int
//      (CC_C Char Wildcard Char (T_A Char))
//      (CC_A Int (T_A Int))
//      (T_A Char))
// This is not matched: (CC_B Char
//      Int
//      (CC_C Char Wildcard Char (T_A Char))
//      (CC_A Int (T_A Int))
//      (T_A Char))
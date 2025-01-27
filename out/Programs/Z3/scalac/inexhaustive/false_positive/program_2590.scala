package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[(Boolean,Int), Byte], b: T_B[Int, Char]) extends T_A[T_B[Boolean, Boolean], T_B[Boolean, Int]]
case class CC_B[E, F, G](a: E) extends T_B[E, F]
case class CC_C[I, H](a: CC_A, b: CC_B[H, H, Byte], c: T_B[I, H]) extends T_B[H, I]

val v_a: T_A[T_B[Boolean, Boolean], T_B[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_B Int Char Boolean Wildcard (T_B Int Char))
//      (T_A (T_B Boolean Boolean) (T_B Boolean Int)))
// This is not matched: (CC_A Byte
//      (CC_B Byte
//            (CC_C Byte (T_A Byte))
//            (CC_C Char (T_A Char))
//            Wildcard
//            (T_A Byte))
//      Byte
//      (T_A Byte))
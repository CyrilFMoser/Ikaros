package Program_14 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Int], b: T_A[Byte], c: T_A[(Char,Int)]) extends T_A[T_A[Byte]]
case class CC_B() extends T_A[T_A[Byte]]
case class CC_C(a: CC_B, b: CC_B, c: T_B[(Boolean,Boolean)]) extends T_A[T_A[Byte]]
case class CC_D[C, D](a: CC_B, b: T_B[C], c: T_A[C]) extends T_B[C]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
}
}
// This is not matched: (CC_D (CC_B Boolean) Boolean Wildcard Wildcard Wildcard (T_B (CC_B Boolean)))
// This is not matched: (CC_A (CC_B Wildcard T_A)
//      (CC_B Wildcard T_A)
//      (CC_A (CC_B (CC_B (CC_B Wildcard T_A) T_A) T_A)
//            Wildcard
//            (CC_B Wildcard T_A)
//            T_A)
//      T_A)
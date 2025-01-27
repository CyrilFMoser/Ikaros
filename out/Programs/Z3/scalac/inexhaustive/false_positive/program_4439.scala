package Program_15 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Boolean, Byte], b: T_A[Char, Byte], c: T_A[Boolean, Boolean]) extends T_A[T_A[Char, (Char,Int)], T_A[Int, Byte]]
case class CC_B[E]() extends T_B[T_A[CC_A, CC_A], T_A[(Int,Boolean), CC_A]]
case class CC_C[G, F](a: T_B[F, F], b: G, c: Int) extends T_B[F, G]
case class CC_D(a: T_A[(Byte,Int), CC_A], b: CC_C[CC_A, CC_A]) extends T_B[T_A[CC_A, CC_A], T_A[(Int,Boolean), CC_A]]

val v_a: T_B[T_A[CC_A, CC_A], T_A[(Int,Boolean), CC_A]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}
// This is not matched: (CC_B Boolean
//      (T_B (T_A (CC_A Boolean Boolean Boolean Boolean)
//                (CC_A Boolean Boolean Boolean Boolean))
//           (T_A (Tuple Int Boolean) (CC_A Boolean Boolean Boolean Boolean))))
// This is not matched: (CC_B Int Char (T_B Int Char))
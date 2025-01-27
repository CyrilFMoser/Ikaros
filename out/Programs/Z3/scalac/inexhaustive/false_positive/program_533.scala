package Program_30 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B(a: T_A[Int, Char], b: CC_A[(Boolean,Byte), Int]) extends T_A[CC_A[Int, Boolean], T_A[Int, Int]]
case class CC_C[G, H](a: H) extends T_B[Boolean, G]
case class CC_D[I]() extends T_B[I, (CC_B,CC_B)]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}
// This is not matched: (CC_C Boolean Byte Byte (T_B Boolean Boolean))
// This is not matched: (CC_A Int (T_A Int))
package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Int], T_A[Int]], b: T_A[Int], c: Byte) extends T_A[Int]
case class CC_B[E, D, F](a: T_A[Int], b: F, c: T_A[D]) extends T_B[E, D]
case class CC_C[G, H](a: T_B[H, T_B[G, H]], b: T_B[G, H], c: (T_A[Int],CC_B[CC_A, CC_A, CC_A])) extends T_B[G, H]
case class CC_D[I, J](a: Boolean, b: J) extends T_B[I, J]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, _) => 2 
}
}
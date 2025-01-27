package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Byte) extends T_A[Byte, E]
case class CC_B[F](a: Boolean) extends T_B[T_A[T_B[Boolean, Int], CC_A[Byte]], F]
case class CC_C[G, H](a: H, b: ((Boolean,Int),Int), c: (T_A[Byte, Boolean],CC_B[Char])) extends T_B[H, G]
case class CC_D[I](a: (Boolean,T_B[Int, Char]), b: (CC_B[Int],CC_C[Byte, Byte]), c: Int) extends T_B[T_A[T_B[Boolean, Int], CC_A[Byte]], I]

val v_a: T_B[T_A[T_B[Boolean, Int], CC_A[Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, _, _) => 2 
}
}
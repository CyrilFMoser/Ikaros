package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[((Boolean,Int),Int)]]
case class CC_B(a: T_A[CC_A], b: (T_A[CC_A],Int), c: CC_A) extends T_A[T_A[((Boolean,Int),Int)]]
case class CC_C[E, D, F](a: CC_A, b: T_B[Byte, Byte]) extends T_B[E, D]
case class CC_D[G, H](a: T_A[G], b: CC_C[G, H, G], c: Byte) extends T_B[G, (T_B[CC_B, CC_B],T_B[Int, CC_B])]
case class CC_E[I](a: T_B[I, I], b: CC_A) extends T_B[I, (T_B[CC_B, CC_B],T_B[Int, CC_B])]

val v_a: T_A[T_A[((Boolean,Int),Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_), CC_A()) => 1 
}
}
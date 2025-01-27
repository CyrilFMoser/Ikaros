package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[T_A[Byte, Int], T_A[Byte, Boolean]], D]
case class CC_B(a: T_A[(Byte,Byte), T_A[Int, Byte]], b: Char) extends T_A[(Int,T_B[Char]), T_A[CC_A[(Boolean,Int)], Int]]
case class CC_C[E](a: CC_B) extends T_B[E]
case class CC_D(a: Boolean, b: CC_B) extends T_B[CC_C[T_A[Byte, CC_B]]]

val v_a: T_B[CC_C[T_A[Byte, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _)) => 0 
  case CC_D(_, _) => 1 
}
}
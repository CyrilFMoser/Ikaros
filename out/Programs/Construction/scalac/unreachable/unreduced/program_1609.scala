package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E], b: E) extends T_A[(T_A[Int, Boolean],T_A[Boolean, (Int,Byte)]), E]
case class CC_B(a: (T_A[Byte, (Byte,Byte)],CC_A[Boolean]), b: (CC_A[Int],CC_A[Byte])) extends T_A[(T_A[Int, Boolean],T_A[Boolean, (Int,Byte)]), T_A[(Int,Char), T_A[Int, Char]]]
case class CC_C(a: T_B[(CC_B,(Boolean,Boolean)), (CC_B,CC_B)], b: Int) extends T_A[(T_A[Int, Boolean],T_A[Boolean, (Int,Byte)]), T_A[(Int,Char), T_A[Int, Char]]]
case class CC_D[F]() extends T_B[CC_A[F], F]

val v_a: T_A[(T_A[Int, Boolean],T_A[Boolean, (Int,Byte)]), T_A[(Int,Char), T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, (_,_)) => 1 
}
}
// This is not matched: CC_C(_, _)
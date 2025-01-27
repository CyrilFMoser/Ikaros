package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: Byte, b: (((Int,Char),Int),Byte), c: T_A[E]) extends T_A[E]
case class CC_C[F](a: CC_B[F], b: T_B[F, F], c: T_B[F, F]) extends T_A[F]
case class CC_D(a: Int, b: (CC_C[Int],T_A[(Char,Boolean)]), c: T_A[T_A[Byte]]) extends T_B[T_A[CC_B[Byte]], T_A[T_A[Int]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_), _) => 1 
  case CC_C(_, _, _) => 2 
}
}
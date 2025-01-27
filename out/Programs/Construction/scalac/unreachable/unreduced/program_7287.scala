package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, T_A[D]], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: ((Int,Int),Char), b: (CC_B[Int],T_B[Boolean, Boolean]), c: T_A[(Int,Boolean)]) extends T_A[T_B[T_A[Int], T_A[Int]]]
case class CC_D(a: (T_B[CC_C, (Byte,Int)],T_A[CC_C]), b: Byte) extends T_B[CC_B[T_A[CC_C]], ((CC_C,CC_C),T_A[CC_C])]
case class CC_E[F]() extends T_B[F, CC_C]

val v_a: T_A[T_A[T_B[T_A[Int], T_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
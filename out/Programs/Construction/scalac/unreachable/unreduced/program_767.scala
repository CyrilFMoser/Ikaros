package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[(T_A[Int],T_A[Int])]
case class CC_C(a: T_A[CC_A[(Int,Int)]], b: (T_A[Byte],CC_B[Char]), c: T_A[(Byte,Boolean)]) extends T_A[(T_A[Int],T_A[Int])]
case class CC_D[F](a: (Boolean,T_B[CC_C, CC_C]), b: T_A[F]) extends T_B[F, CC_C]

val v_a: T_A[(T_A[Int],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, (_,_), CC_A(_, _))
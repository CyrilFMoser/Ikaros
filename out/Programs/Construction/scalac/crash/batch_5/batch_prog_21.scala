package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[(T_B,T_A[(Boolean,Char), (Boolean,Int)]), C]
case class CC_B[E, D](a: T_A[D, D], b: D, c: Boolean) extends T_A[E, D]
case class CC_C[F]() extends T_A[(T_B,T_A[(Boolean,Char), (Boolean,Int)]), F]

val v_a: T_A[Boolean, T_B] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}
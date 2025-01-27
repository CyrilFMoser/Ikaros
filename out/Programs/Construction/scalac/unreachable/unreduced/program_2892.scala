package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: Int) extends T_A[D, (T_A[Int, Int],T_B[(Byte,Boolean)])]
case class CC_B[E]() extends T_A[E, (T_A[Int, Int],T_B[(Byte,Boolean)])]
case class CC_C[F](a: F) extends T_A[F, (T_A[Int, Int],T_B[(Byte,Boolean)])]

val v_a: T_A[Char, (T_A[Int, Int],T_B[(Byte,Boolean)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}
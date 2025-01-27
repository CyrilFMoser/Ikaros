package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[((Boolean,Byte),Boolean), Boolean], C]
case class CC_B[D, E]() extends T_A[T_A[((Boolean,Byte),Boolean), Boolean], D]
case class CC_C[F]() extends T_A[CC_B[Int, Char], F]

val v_a: T_A[T_A[((Boolean,Byte),Boolean), Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
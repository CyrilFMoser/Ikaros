package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Byte]], b: T_B[T_A[Boolean, Byte]]) extends T_A[(Byte,T_B[(Char,Int)]), (T_A[Boolean, Boolean],T_B[(Boolean,Boolean)])]
case class CC_B[D](a: CC_A, b: T_B[D], c: CC_A) extends T_B[D]
case class CC_C[E](a: E, b: CC_A, c: T_A[E, E]) extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_B(_, _, _), CC_A(_, _)) => 0 
  case CC_B(CC_A(_, _), CC_C(_, _, _), CC_A(_, _)) => 1 
  case CC_B(CC_A(_, _), CC_D(), CC_A(_, _)) => 2 
  case CC_C(_, _, _) => 3 
  case CC_D() => 4 
}
}
package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B, Char], Char], T_B]
case class CC_B(a: T_B, b: T_A[T_A[Int, T_B], Byte], c: T_B) extends T_A[T_A[T_A[T_B, Char], Char], T_B]
case class CC_C[C](a: CC_A, b: (T_B,Char)) extends T_A[T_A[T_A[T_B, Char], Char], T_B]
case class CC_D(a: CC_C[Byte]) extends T_B

val v_a: T_A[T_A[T_A[T_B, Char], Char], T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(CC_C(_, _)), _, _) => 1 
  case CC_C(CC_A(), _) => 2 
}
}
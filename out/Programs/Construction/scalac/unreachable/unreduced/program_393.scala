package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]], b: (T_B[Byte],Byte), c: T_B[T_A[Char]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B[C](a: Int) extends T_B[C]
case class CC_C[D](a: Int) extends T_B[D]
case class CC_D[E](a: T_B[E], b: T_A[E]) extends T_B[E]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
  case CC_D(_, _) => 3 
}
}
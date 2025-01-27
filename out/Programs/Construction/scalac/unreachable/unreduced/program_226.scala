package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[Int, Byte], Char], C]
case class CC_B[D](a: (T_A[Boolean, Char],(Int,Boolean))) extends T_A[T_A[T_A[Int, Byte], Char], D]
case class CC_C[E](a: T_A[E, E], b: CC_A[E], c: Byte) extends T_A[T_A[T_A[Int, Byte], Char], E]

val v_a: T_A[T_A[T_A[Int, Byte], Char], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_)) => 1 
  case CC_C(_, CC_A(_), _) => 2 
}
}
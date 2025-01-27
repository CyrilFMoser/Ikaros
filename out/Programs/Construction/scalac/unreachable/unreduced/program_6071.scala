package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C], c: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: CC_A[D], c: ((Char,Char),(Int,Boolean))) extends T_A[D]
case class CC_C[E](a: CC_B[E]) extends T_A[E]
case class CC_D(a: T_A[T_A[Int]], b: T_B[T_A[Boolean]]) extends T_B[T_B[T_B[Char]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _, _), _, _) => 1 
  case CC_A(CC_C(CC_B(_, _, _)), _, _) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(CC_B(_, CC_A(_, _, _), (_,_))) => 4 
}
}
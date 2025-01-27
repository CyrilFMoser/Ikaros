package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: D, c: (T_A[Byte, Byte],(Char,(Byte,Boolean)))) extends T_A[C, D]
case class CC_B[E](a: E, b: E, c: (CC_A[Char, Int],Boolean)) extends T_A[E, T_A[T_A[Int, Int], CC_A[Boolean, Char]]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, (CC_A(_, _, _),_)) => 0 
}
}
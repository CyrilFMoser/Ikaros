package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[T_A[CC_A[Char], CC_A[Char]], T_A[T_A[CC_A[Char], CC_A[Char]], T_A[CC_A[Char], CC_A[Char]]]], b: (CC_A[Byte],(Char,Boolean))) extends T_A[D, T_A[D, D]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,_)) => 1 
}
}
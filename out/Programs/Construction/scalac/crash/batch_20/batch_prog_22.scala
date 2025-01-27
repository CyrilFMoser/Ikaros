package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, T_A[C, C]], c: T_A[T_A[Boolean, Int], C]) extends T_A[C, T_A[T_A[Int, Boolean], Byte]]
case class CC_B[E, D](a: (CC_A[Char],(Char,Boolean))) extends T_A[D, E]

val v_a: CC_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),(_,_))) => 0 
}
}
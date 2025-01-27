package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: D, c: D) extends T_A[C, T_A[T_A[Byte, Boolean], (Boolean,Char)]]
case class CC_B[E](a: CC_A[E, CC_A[Byte, E]], b: (CC_A[Char, Int],(Boolean,(Int,Char)))) extends T_A[E, T_A[T_A[Byte, Boolean], (Boolean,Char)]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Boolean], (Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (CC_A(_, _, _),(_,_))) => 1 
}
}
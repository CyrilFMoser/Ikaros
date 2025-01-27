package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_B[D]]
case class CC_B() extends T_B[T_A[CC_A[Int], T_B[CC_A[Int]]]]
case class CC_C[E](a: CC_B, b: T_A[E, E], c: (T_B[CC_B],((Byte,Byte),(Char,Boolean)))) extends T_B[E]
case class CC_D(a: T_A[CC_C[Int], T_B[CC_C[Int]]]) extends T_B[T_A[CC_A[Int], T_B[CC_A[Int]]]]

val v_a: T_B[T_A[CC_A[Int], T_B[CC_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, (CC_C(_, _, _),(_,_))) => 1 
  case CC_D(CC_A(CC_C(_, _, _))) => 2 
}
}
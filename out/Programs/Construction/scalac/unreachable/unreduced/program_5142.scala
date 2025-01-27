package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,Boolean), T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A, b: (CC_A,CC_A), c: T_A) extends T_A
case class CC_C[C]() extends T_B[CC_B, C]
case class CC_D[D](a: (T_A,(CC_A,Boolean))) extends T_B[CC_B, D]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D((CC_A(_),(_,_))) => 1 
  case CC_D((CC_B(_, _, _),(_,_))) => 2 
}
}
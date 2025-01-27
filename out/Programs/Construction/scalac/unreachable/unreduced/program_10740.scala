package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: T_A[C, D], c: (T_A[Boolean, Char],Char)) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[E](a: CC_A[CC_A[E, E], E], b: Int) extends T_A[E, T_A[E, T_A[E, E]]]
case class CC_C(a: (CC_B[Int],(Byte,Byte))) extends T_A[CC_A[T_A[Boolean, Byte], CC_A[Boolean, Boolean]], T_A[CC_A[T_A[Boolean, Byte], CC_A[Boolean, Boolean]], T_A[CC_A[T_A[Boolean, Byte], CC_A[Boolean, Boolean]], CC_A[T_A[Boolean, Byte], CC_A[Boolean, Boolean]]]]]

val v_a: T_A[CC_A[T_A[Boolean, Byte], CC_A[Boolean, Boolean]], T_A[CC_A[T_A[Boolean, Byte], CC_A[Boolean, Boolean]], T_A[CC_A[T_A[Boolean, Byte], CC_A[Boolean, Boolean]], CC_A[T_A[Boolean, Byte], CC_A[Boolean, Boolean]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C((CC_B(_, _),(_,_)))
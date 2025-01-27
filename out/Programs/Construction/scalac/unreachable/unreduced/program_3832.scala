package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Int, Int], T_B[Byte, Boolean]], b: T_A[T_B[Byte, Boolean], T_B[Boolean, Boolean]], c: T_A[T_A[Int, Char], T_A[Char, Int]]) extends T_A[T_B[T_B[Boolean, Byte], (Boolean,Boolean)], T_B[T_B[Byte, Boolean], T_B[Int, Int]]]
case class CC_B(a: (CC_A,(CC_A,CC_A))) extends T_A[T_B[T_B[Boolean, Byte], (Boolean,Boolean)], T_B[T_B[Byte, Boolean], T_B[Int, Int]]]
case class CC_C(a: CC_A, b: CC_B, c: CC_B) extends T_A[T_B[T_B[Boolean, Byte], (Boolean,Boolean)], T_B[T_B[Byte, Boolean], T_B[Int, Int]]]
case class CC_D[E](a: Boolean, b: E) extends T_B[CC_C, E]

val v_a: T_A[T_B[T_B[Boolean, Byte], (Boolean,Boolean)], T_B[T_B[Byte, Boolean], T_B[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_A(_, _, _),(_,_))) => 1 
  case CC_C(_, _, CC_B(_)) => 2 
}
}
package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: (T_B,(T_B,CC_A)), b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: T_A[T_A[CC_B]], c: CC_B) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_B((CC_C(),(_,_)), CC_C()) => 0 
  case CC_B((CC_C(),(_,_)), CC_D(_, _, _)) => 1 
  case CC_B((CC_D(_, _, _),(_,_)), CC_C()) => 2 
  case CC_B((CC_D(_, _, _),(_,_)), CC_D(_, _, _)) => 3 
}
}
// This is not matched: CC_A(_)
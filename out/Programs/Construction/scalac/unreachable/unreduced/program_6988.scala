package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: (T_A[Char, Boolean],Boolean)) extends T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]]

val v_a: T_A[CC_A[Int], T_A[CC_A[Int], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_)) => 1 
}
}
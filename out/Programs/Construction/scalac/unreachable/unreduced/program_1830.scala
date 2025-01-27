package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: (T_A[CC_A],T_A[Boolean])) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: Int, b: CC_A, c: CC_A) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), (_,_)) => 1 
  case CC_C(12, CC_A(), CC_A()) => 2 
}
}
// This is not matched: CC_C(_, CC_A(), CC_A())
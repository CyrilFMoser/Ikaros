package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Boolean,Int), Boolean], Char], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]]
case class CC_B(a: (CC_A,T_A[Boolean, CC_A]), b: (CC_A,Int)) extends T_A[T_A[T_A[(Boolean,Int), Boolean], Char], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]]
case class CC_C(a: CC_A, b: CC_A) extends T_A[T_A[T_A[(Boolean,Int), Boolean], Char], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]]

val v_a: T_A[T_A[T_A[(Boolean,Int), Boolean], Char], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C(CC_A(), CC_A()) => 1 
}
}
// This is not matched: CC_A()
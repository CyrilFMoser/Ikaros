package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Int, b: (Int,T_A[CC_A]), c: Int) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: (((Int,Int),CC_B),Int)) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_), _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()
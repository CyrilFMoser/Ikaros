package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Boolean,Boolean)]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Char, b: (Char,((Int,Int),CC_A)), c: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C() extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (_,(_,_)), CC_A(_)) => 1 
  case CC_C() => 2 
}
}
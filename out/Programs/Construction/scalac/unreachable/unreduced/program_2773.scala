package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Int,Boolean)]]
case class CC_B(a: (T_A[Byte],T_A[CC_A]), b: T_A[T_A[CC_A]]) extends T_A[T_A[(Int,Boolean)]]

val v_a: T_A[T_A[(Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _) => 1 
}
}
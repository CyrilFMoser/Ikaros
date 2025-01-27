package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Int],Int)]
case class CC_B(a: (Boolean,T_A[Int]), b: T_A[T_A[CC_A]], c: T_A[CC_A]) extends T_A[(T_A[Int],Int)]

val v_a: T_A[(T_A[Int],Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _, _) => 1 
}
}
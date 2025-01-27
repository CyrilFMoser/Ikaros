package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Int]), b: T_A[T_A[Byte]], c: Boolean) extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_B() extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_A[T_A[(Int,Byte)]]]

val v_a: T_A[T_A[T_A[(Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, true) => 0 
  case CC_A((_,_), _, false) => 1 
  case CC_B() => 2 
  case CC_C(CC_A(_, _, _), CC_B()) => 3 
}
}
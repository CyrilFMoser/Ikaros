package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[T_A[T_A[Int]]]
case class CC_C(a: (T_A[(Char,Boolean)],Byte)) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_)) => 1 
}
}
// This is not matched: CC_A()
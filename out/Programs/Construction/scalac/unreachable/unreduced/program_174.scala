package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Byte])) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A(_), _, _) => 1 
}
}
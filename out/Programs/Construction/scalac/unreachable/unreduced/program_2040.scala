package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B[B](a: Char, b: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_A[T_A[Int]], b: Boolean, c: (Byte,CC_B[CC_A])) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, (_,CC_B(_, _))) => 2 
}
}
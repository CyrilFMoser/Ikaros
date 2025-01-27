package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Int]], c: T_A[T_A[Char]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: Char, b: (CC_A,CC_B), c: (Boolean,Byte)) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}
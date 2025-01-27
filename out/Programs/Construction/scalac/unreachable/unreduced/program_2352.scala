package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: (T_A[(Byte,Int)],T_A[Byte])) extends T_A[T_A[T_A[Char]]]
case class CC_B[B](a: B, b: Boolean) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: Char) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, true) => 1 
  case CC_B(_, false) => 2 
  case CC_C(_) => 3 
}
}
package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: (Int,Byte)) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: T_A[T_A[Int]], c: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _, CC_A(_, (_,_))) => 1 
  case CC_C(_) => 2 
}
}
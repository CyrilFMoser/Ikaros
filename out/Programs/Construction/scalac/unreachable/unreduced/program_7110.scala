package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: (T_A[Int],T_A[Byte]), c: (Char,T_A[Int])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: (T_A[CC_A],T_A[Char])) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: Byte) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B((_,_)) => 1 
  case CC_C(_) => 2 
}
}
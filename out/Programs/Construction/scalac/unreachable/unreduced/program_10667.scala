package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[T_A[Char]], c: (Byte,(Boolean,Int))) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: (Boolean,T_A[Char])) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C((_,_)) => 2 
}
}
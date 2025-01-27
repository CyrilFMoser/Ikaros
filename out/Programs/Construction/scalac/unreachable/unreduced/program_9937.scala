package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: (Boolean,Byte), b: E) extends T_B[E, T_A[E]]
case class CC_C() extends T_B[CC_A[Byte], T_A[CC_A[Byte]]]
case class CC_D(a: T_B[(CC_C,Char), T_B[CC_C, Byte]], b: T_B[T_A[CC_C], CC_A[CC_C]], c: (CC_A[Boolean],Int)) extends T_B[CC_A[Byte], T_A[CC_A[Byte]]]

val v_a: T_B[CC_A[Byte], T_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C() => 1 
  case CC_D(_, _, (CC_A(_),_)) => 2 
}
}
package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Byte]
case class CC_B(a: T_A[CC_A], b: CC_A) extends T_A[Byte]
case class CC_C(a: T_A[Byte], b: T_B[T_B[CC_B]], c: T_B[T_B[CC_B]]) extends T_A[Byte]
case class CC_D[C](a: (Char,T_B[Byte]), b: T_A[C]) extends T_B[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_C(CC_A(), CC_D(_, _), CC_D((_,_), _)) => 2 
  case CC_C(CC_B(_, _), CC_D(_, _), CC_D((_,_), _)) => 3 
  case CC_C(CC_C(_, _, _), CC_D(_, _), CC_D((_,_), _)) => 4 
}
}
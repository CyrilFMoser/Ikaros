package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[(Boolean,Byte)]], b: (T_B[T_A],Char), c: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A], c: CC_A) extends T_A
case class CC_C(a: T_A, b: T_A, c: T_B[T_B[CC_A]]) extends T_B[T_B[T_B[T_A]]]
case class CC_D(a: T_A) extends T_B[T_B[T_B[T_A]]]
case class CC_E() extends T_B[T_B[T_B[T_A]]]

val v_a: T_B[T_B[T_B[T_A]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, (_,_), _), _) => 0 
  case CC_C(_, CC_B(_, _, _), _) => 1 
  case CC_D(CC_A(_, (_,_), CC_A(_, _, _))) => 2 
  case CC_D(CC_A(_, (_,_), CC_B(_, _, _))) => 3 
  case CC_D(CC_B(_, _, _)) => 4 
  case CC_E() => 5 
}
}
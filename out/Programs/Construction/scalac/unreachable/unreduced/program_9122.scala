package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Char) extends T_A[T_B]
case class CC_B(a: CC_A, b: (T_A[T_B],Byte), c: T_B) extends T_B
case class CC_C(a: T_A[Boolean], b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_A(_, _),_), CC_B(_, (_,_), _)) => 0 
  case CC_B(_, (CC_A(_, _),_), CC_C(_, _)) => 1 
  case CC_C(_, _) => 2 
}
}
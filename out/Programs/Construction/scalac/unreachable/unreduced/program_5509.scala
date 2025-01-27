package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: (T_A[Byte],T_A[Boolean])) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: Boolean) extends T_A[Byte]
case class CC_D[C](a: Char, b: T_A[C]) extends T_B[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
  case CC_A(_, (CC_B(),_)) => 1 
  case CC_A(_, (CC_C(_),_)) => 2 
  case CC_B() => 3 
  case CC_C(_) => 4 
}
}